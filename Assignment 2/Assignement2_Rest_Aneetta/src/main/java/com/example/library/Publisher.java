package com.example.library;



import java.util.List;

import jakarta.persistence.*;


@Entity
@Table

public class Publisher {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  pubId;

    @Column
    private String name;
    @Column
    private String address;

    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL)
    private List<Book> books;

	public Publisher() {
		super();
		
	}

	public Publisher(int pubId, String name, String address, List<Book> books) {
		super();
		this.pubId = pubId;
		this.name = name;
		this.address = address;
		this.books = books;
	}

	public int getPubId() {
		return pubId;
	}

	public void setPubId(int pubId) {
		this.pubId = pubId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}