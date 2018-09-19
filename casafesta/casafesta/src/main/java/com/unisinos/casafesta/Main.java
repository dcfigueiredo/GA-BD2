package com.unisinos.casafesta;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.unisinos.casafesta.entity.Festa;
import com.unisinos.casafesta.entity.Ingresso;
import com.unisinos.casafesta.entity.Integrante;
import com.unisinos.casafesta.entity.Promocao;
import com.unisinos.casafesta.mapper.FestaDtoMapper;
import com.unisinos.casafesta.mapper.FestaMapper;
import com.unisinos.casafesta.mapper.IntegranteDtoMapper;
import com.unisinos.casafesta.mapper.PromocoesDtoMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.LocalDate.now;

public class Main {

    private static Gson gson;

    public static void main(String[] args) {
        gson = new GsonBuilder().setPrettyPrinting()
//                .setExclusionStrategies(new ExclusionStrategy() {
//                    @Override
//                    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
//                        return false;
//                    }
//
//                    @Override
//                    public boolean shouldSkipClass(Class<?> aClass) {
//                        return aClass.equals(Promocao.class);
//                    }
//                })
                .create();

        try (SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory()) {
            persist(sessionFactory);
            load(sessionFactory);
        }
    }

    private static void persist(SessionFactory sessionFactory) {
        Promocao p1 = new Promocao(15, now().minusMonths(1), now().plusMonths(1));
        Promocao p2 = new Promocao(5, now().minusMonths(2), now().plusMonths(2));

        Festa f1 = new Festa("Inferninho", "Hue", now());
        f1.getPromocoes().add(p1);
        f1.getIngressos().add(new Ingresso("pista", 55.));
        Ingresso i1 = new Ingresso("pista", 55.);
        i1.setIntegrante(new Integrante("Felipe", "999-888-777", now()));
        f1.getIngressos().add(i1);
        f1.getIngressos().add(new Ingresso("pista", 55.));
        Ingresso i2 = new Ingresso("backstage", 110.);
        i2.setIntegrante(new Integrante("Victor", "777-888-999", now()));
        f1.getIngressos().add(i2);

        Festa f2 = new Festa("MC Igu", "Trap", now().minusWeeks(2));
        f2.getPromocoes().add(p1);
        f2.getPromocoes().add(p2);
        f2.getIngressos().add(new Ingresso("pista", 15.));
        f2.getIngressos().add(new Ingresso("backstage", 55.));

        Festa f3 = new Festa("Childish Gambino", "Rap", now().plusYears(6));
        f3.getIngressos().add(new Ingresso("pista", 110.));
        f3.getIngressos().add(new Ingresso("mesanino", 185.));
        Ingresso i3 = new Ingresso("backstage", 300.);
        i3.setIntegrante(new Integrante("Daniel", "444-111-000", now()));
        f3.getIngressos().add(i3);

        System.out.println("-- persisting data --");
        System.out.printf("- %s%n- %s%n", f1, f2);

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(f1);
        session.save(f2);
        session.save(f3);
        session.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    private static void load(SessionFactory sessionFactory) {
        System.out.println("-- loading data --");
        Session session = sessionFactory.openSession();
        List<Festa> festas = session.createQuery("FROM Festa").list();
        festas.forEach((festa) -> {
            System.out.printf("Festa - %s%n", festa);
            festa.getPromocoes()
                    .stream()
                    .map(p -> "\tPromoção - " + p)
                    .forEach(System.out::println);
            festa.getIngressos()
                    .stream()
                    .forEach(p -> {
                        System.out.println("\tIngresso - " + p);
                        if (p.getIntegrante() != null) {
                            System.out.println("\t\tIntegrante - " + p.getIntegrante());
                        }
                    });
            System.out.println();
        });
        convertToJson(festas);
        session.close();
        xml(festas);
    }

    @SuppressWarnings("unchecked")
    private static void xml(List<Festa> festas) {
        System.out.println("\n\n-- loading printing xml --");
        try {
            JAXBContext context = JAXBContext.newInstance(com.unisinos.casafesta.xml.Festa.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            QName qName = new QName("com.unisinos.casafesta.xml", "festas");
            for (Festa festa : festas) {
                JAXBElement<com.unisinos.casafesta.xml.Festa> root = new JAXBElement<>(qName, com.unisinos.casafesta.xml.Festa.class, FestaMapper.from(festa));
                marshaller.marshal(root, System.out);
                System.out.print("\n\n\n");
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static void convertToJson(List<Festa> festas) {
        printFestas(festas);
        printIngressos(festas);
        printPromocoes(festas);
    }

    private static void printIntegrantes(List<Ingresso> ingressos) {
        List<Integrante> integrantes = ingressos.stream().map(Ingresso::getIntegrante).collect(Collectors.toList());
        System.out.println("\n\nIntegrantes JSON:\n\n");
        String integrantesJson = gson.toJson(IntegranteDtoMapper.toListIntegranteDto(integrantes));
        System.out.println(integrantesJson);
    }

    private static void printPromocoes(List<Festa> festas) {
        ArrayList<Promocao> promocoes = new ArrayList<>();
        festas.stream().forEach(festa -> promocoes.addAll(festa.getPromocoes()));
        String promocoesJson = gson.toJson(PromocoesDtoMapper.toListPromocaoDto(promocoes));
        System.out.println("\n\nPromoções JSON: \n\n");
        System.out.println(promocoesJson);
    }

    private static void printIngressos(List<Festa> festas) {
        ArrayList<Ingresso> ingressos = new ArrayList<>();
        festas.stream().forEach(festa -> ingressos.addAll(festa.getIngressos()));
        String ingressosJson = gson.toJson(FestaDtoMapper.toListFestaDto(festas));
        System.out.println("\n\nIngressos JSON: \n\n");
        System.out.println(ingressosJson);
        printIntegrantes(ingressos);
    }

    private static void printFestas(List<Festa> festas) {
        System.out.println("\n\nFestas JSON: \n\n");
        String festasJson = gson.toJson(FestaDtoMapper.toListFestaDto(festas));
        System.out.println(festasJson);
    }
}