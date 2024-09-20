package com.example.graphQL.models

data class Book(
    var id : Long = 0L,
    var name : String ?=null,
    var pageCount : Int = 0,
    var author : Author ?=null
)