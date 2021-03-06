package ru.edu.hse.sdfomin.HousingAndCommunalServices.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private List<Person> persons;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "house_mamager_id")
    private HouseManager houseManager;

    public House() {
    }

    public House(Address address, List<Person> persons, HouseManager houseManager) {
        this.address = address;
        this.persons = persons;
        this.houseManager = houseManager;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> users) {
        this.persons = users;
    }

    public HouseManager getHouseManager() {
        return houseManager;
    }

    public void setHouseManager(HouseManager houseManager) {
        this.houseManager = houseManager;
    }
}
