package com.plcoding.bookpedia.book.presentation.book_list.components

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier

import androidx.compose.material.OutlinedTextField


@Composable
fun BookSearchBar(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onImeSearch: () -> Unit = {},
    modifier: Modifier = Modifier
){
    OutlinedTextField(
        value = searchQuery,
        onValueChange = onSearchQueryChange,

    )
}