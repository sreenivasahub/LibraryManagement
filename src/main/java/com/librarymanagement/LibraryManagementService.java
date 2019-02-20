package com.librarymanagement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagement.model.Library;
import com.librarymanagement.repository.LibraryManagementRepository;


@RestController
public class LibraryManagementService {
	@Autowired
	LibraryManagementRepository repository;
	
	@RequestMapping("/hello")
	public String showWelcome(){
		System.out.println( " Inside hello" );

		
		return "welcome";
		
	}
	
	@RequestMapping(value="/add" ,method=RequestMethod.POST)
	/*public String addBooks(@RequestParam(value="name", required=true) String name,
			@RequestParam(value="edition", required=true) String edition,
			@RequestParam(value="price", required=true) int price,
			@RequestParam(value="authorName", required=true) String authorName,
			@RequestParam(value="issuedTo", required=true) String issuedTo){*/
	public String addBooks(@RequestBody Library l){
		
		
		
		
		/*Library l=new Library();
		l.setAuthorName(authorName);
		l.setName(name);
		l.setEdition(edition);
		l.setPrice(price);
		l.setIssuedTo(issuedTo);*/
		repository.save(l);
		return "Record added successfully";
		
	}
	
	@RequestMapping("/search")
	public List<String> findBooks(){
		System.out.println( " Inside findBooks" );

		List bookList  =  new ArrayList<String>();
		
		return bookList;
		
	}
	
	@RequestMapping("/view/{id}")
	public Library viewBooks(@PathVariable("id") Integer id){
		Library i=repository.findOne(id.intValue());
		return i;
		
	}
	
	@RequestMapping("/viewall")
	public List<Library> getAllItems(){
		
		return (List<Library>) repository.findAll();
		
	}
	
	
	@RequestMapping("/delete")
	public String delete(){
		
		
		return "Record deleted";
		
	}

}
