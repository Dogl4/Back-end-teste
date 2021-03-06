package br.com.dogla.agrotis.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "solicitation")
public class Solicitation {
        @Id
        @SequenceGenerator(name = "solicitation_sequence", sequenceName = "solicitation_sequence", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "id", nullable = false)
        private Long id;

        @Column(name = "name", nullable = false)
        private String nome;

        @Column(name = "date_init", nullable = false)
        private String dataInicial;

        @Column(name = "date_end", nullable = false)
        private String dataFinal;

        @Column(name = "cnpj", nullable = false, length = 14)
        private String cnpj;

        @Column(name = "observation", nullable = false)
        private String observacoes;

//        @OneToMany(cascade = CascadeType.ALL)
//        private List<Property> infoPropriedade;
        @Column(name = "property")
        private Integer infoPropriedade;

//        @OneToMany(cascade = CascadeType.ALL)
//        private List<Laboratory> laboratorio;
        @Column(name = "laboratory")
        private Integer laboratorio;
}
