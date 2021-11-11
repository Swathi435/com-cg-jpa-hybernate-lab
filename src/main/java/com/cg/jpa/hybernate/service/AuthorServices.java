package com.cg.jpa.hybernate.service;


import com.cg.jpa.hybernate.entities.*;

	public interface AuthorServices {
		public abstract void addAuthor(Author author);
		public abstract void updateAuthor(Author author);
		public abstract void removeAuthor(Author author);
		public abstract Author findAuthorById(int id);
	}


