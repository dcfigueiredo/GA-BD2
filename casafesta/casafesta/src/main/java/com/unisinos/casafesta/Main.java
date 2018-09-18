package com.unisinos.casafesta;

import com.unisinos.casafesta.entity.Festa;
import com.unisinos.casafesta.entity.Ingresso;
import com.unisinos.casafesta.entity.Integrante;
import com.unisinos.casafesta.entity.Promocao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

import static java.time.LocalDate.now;

public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        try {
            persist(sessionFactory);
            load(sessionFactory);
        } finally {
            sessionFactory.close();
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
        festas.forEach((x) -> {
            System.out.printf("Festa - %s%n", x);
            x.getPromocoes()
                    .stream()
                    .map(p -> "\tPromoção - " + p)
                    .forEach(System.out::println);
            x.getIngressos()
                    .stream()
                    .forEach(p -> {
                        System.out.println("\tIngresso - " + p);
                        if (p.getIntegrante() != null) {
                            System.out.println("\t\tIntegrante - " + p.getIntegrante());
                        }
                    });
            System.out.println();
        });
        session.close();
    }
}
