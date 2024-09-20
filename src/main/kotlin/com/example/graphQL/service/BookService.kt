package com.example.graphQL.service

import com.example.graphQL.models.Author
import com.example.graphQL.models.Book
import org.springframework.stereotype.Service

@Service
class BookService {
    private val authors = listOf(
        Author(1 , "Sok" , "Cheapanha"),
        Author(2 , "Sok" , "Cheapanha"),
        Author(3 , "Sok" , "Cheapanha")
    )
    private fun getAuthorById(id : Long) : Author{
        return authors.first { it.id == id }
    }
    private val books = listOf(
        Book(1 , "Harry Potter and the Philosopher's Stone", 223,getAuthorById(1L)),
        Book(2 , "Interview with the vampire", 223,getAuthorById(1L)),
        Book(3 , "Harry Potter", 223,getAuthorById(1L)),
        Book(4 , "vampire", 223,getAuthorById(1L)),
    )
    fun getBooks() : List<Book>{
        return books
    }
    fun getBookById(id : Long) : Book{
        return books.first { book -> book.id == id }
    }
}