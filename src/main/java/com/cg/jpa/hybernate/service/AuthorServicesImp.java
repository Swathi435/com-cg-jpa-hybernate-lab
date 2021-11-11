package com.cg.jpa.hybernate.service;


	import com.cg.jpa.hybernate.dao.*;
	import com.cg.jpa.hybernate.dao.AuthorImp;

	import com.cg.jpa.hybernate.entities.Author;

	public class AuthorServicesImp implements AuthorServices {

		private Author dao;

		public AuthorServicesImp() {
			dao = new AuthorImp();
		}

		@Override
		public void addAuthor(Author author) {
			dao.beginTransaction();
			try {
				dao.addAuthor(author);
				dao.commitTransaction();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

		@Override
		public void updateAuthor(Author author) {
			dao.beginTransaction();
			dao.updateAuthor(author);
			dao.commitTransaction();
		}

		@Override
		public void removeAuthor(Author author) {
			dao.beginTransaction();
			dao.removeAuthor(author);
			dao.commitTransaction();
		}

		@Override
		public Author findAuthorById(int id) {
			Author author;
			author = dao.getAuthorByAuthorId(id);
			System.out.println("findEmployeeById in EmployeeServiceImpl");
			return author;
		}
	}

}
