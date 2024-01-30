package com.udla.springboot.backend.apirest.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "clientes")

public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;
    private String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private Integer semestreCursado;

    // Cambia el campo 'rol' a una colección de roles
    @ManyToMany
    @JoinTable(name = "cliente_roles", joinColumns = @JoinColumn(name = "cliente_id"), inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles;

    @OneToMany(mappedBy = "cliente1")
    private List<Match> matchesAsCliente1;

    @OneToMany(mappedBy = "cliente2")
    private List<Match> matchesAsCliente2;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private List<ClienteInteres> clienteIntereses;

    // Constructor por defecto requerido por JPA
    protected Cliente() {
    }

    // Constructor privado que utiliza el objeto Builder
    private Cliente(Builder builder) {
        this.id = builder.id;
        this.createAt = builder.createAt;
        this.cedula = builder.cedula;
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.email = builder.email;
        this.semestreCursado = builder.semestreCursado;
        // ... inicializar otros atributos con el builder
    }


    // Getters y setters
    public List<ClienteInteres> getClienteIntereses() {
        return clienteIntereses;
    }

    public void setClienteIntereses(List<ClienteInteres> clienteIntereses) {
        this.clienteIntereses = clienteIntereses;
    }

    @PrePersist
    public void prePersist() {
        createAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getters y setters para roles
    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public List<Match> getMatchesAsCliente1() {
        return matchesAsCliente1;
    }

    public void setMatchesAsCliente1(List<Match> matchesAsCliente1) {
        this.matchesAsCliente1 = matchesAsCliente1;
    }

    public List<Match> getMatchesAsCliente2() {
        return matchesAsCliente2;
    }

    public void setMatchesAsCliente2(List<Match> matchesAsCliente2) {
        this.matchesAsCliente2 = matchesAsCliente2;
    }

    public Integer getSemestreCursado() {
        return semestreCursado;
    }

    public void setSemestreCursado(Integer semestreCursado) {
        this.semestreCursado = semestreCursado;
    }

    // Clase Builder anidada estática
    public static class Builder {
        private Long id;
        private Date createAt;
        private String cedula;
        private String nombre;
        private String apellido;
        private String email;
        private Integer semestreCursado;



        public Builder() {
            // Inicializaciones por defecto si las hay
        }

        // Métodos with para cada atributo

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withCreateAt(Date createAt) {
            this.createAt = createAt;
            return this;
        }

        public Builder withCedula(String cedula) {
            this.cedula = cedula;
            return this;
        }

        public Builder withNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder withApellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withSemestreCursado(Integer semestreCursado) {
            this.semestreCursado = semestreCursado;
            return this;
        }

        public Cliente build() {
            return new Cliente(this);
        }
    }

    private static final long serialVersionUID = 1L;
}