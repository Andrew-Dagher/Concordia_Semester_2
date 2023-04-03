package A3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;



public class Book implements Serializable {
	
	private String title;
	private String author;
	private double price;
	private String isbn;
	private String genre;
	private int year;
	
	public Book() {
		
	}
	
	public Book(String title, String author, double price, String isbn, String genre, int year) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
		this.genre = genre;
		this.year = year;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "The book title is " + title + ",the author name is " + author + ", the price is " + price + ", the isbn is " + isbn + ", the genre is "
				+ genre + " and the year is " + year;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		else {
		Book book = (Book) obj;
		return (this.title.equals(book.title)&& this.author.equals(book.author)&& this.genre.equals(book.genre)&& this.year==book.year&&this.price==book.price);
		}
	}
	
	
	public static void Serialize (Book[][] book,String ser_file) {
		try {
		FileOutputStream file = new FileOutputStream(ser_file);
		ObjectOutputStream out= new ObjectOutputStream(file);
		out.writeObject(book);
		out.close();
		file.close();
		} 
		
		catch (IOException e) {
		e.printStackTrace();
		}
		
	}
	
	
	
}