package com.example.graphQL.controllers

import com.example.graphQL.models.Book
import com.example.graphQL.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController {
    @Autowired lateinit var bookService: BookService

    @QueryMapping
    fun bookById(@Argument id : Long): Book {
        return bookService.getBookById(id)
    }
    @QueryMapping
    fun books(): List<Book> {
        return bookService.getBooks()
    }
}