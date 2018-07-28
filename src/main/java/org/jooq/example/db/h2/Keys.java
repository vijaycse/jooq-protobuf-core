/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.db.h2;


import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.example.db.h2.tables.Author;
import org.jooq.example.db.h2.tables.Book;
import org.jooq.example.db.h2.tables.BookStore;
import org.jooq.example.db.h2.tables.BookToBookStore;
import org.jooq.example.db.h2.tables.records.AuthorRecord;
import org.jooq.example.db.h2.tables.records.BookRecord;
import org.jooq.example.db.h2.tables.records.BookStoreRecord;
import org.jooq.example.db.h2.tables.records.BookToBookStoreRecord;
import org.jooq.impl.Internal;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> PK_T_AUTHOR = UniqueKeys0.PK_T_AUTHOR;
    public static final UniqueKey<BookRecord> PK_T_BOOK = UniqueKeys0.PK_T_BOOK;
    public static final UniqueKey<BookStoreRecord> UK_T_BOOK_STORE_NAME = UniqueKeys0.UK_T_BOOK_STORE_NAME;
    public static final UniqueKey<BookToBookStoreRecord> PK_B2BS = UniqueKeys0.PK_B2BS;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_AUTHOR_ID;
    public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_CO_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_CO_AUTHOR_ID;
    public static final ForeignKey<BookToBookStoreRecord, BookStoreRecord> FK_B2BS_BS_NAME = ForeignKeys0.FK_B2BS_BS_NAME;
    public static final ForeignKey<BookToBookStoreRecord, BookRecord> FK_B2BS_B_ID = ForeignKeys0.FK_B2BS_B_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AuthorRecord> PK_T_AUTHOR = Internal.createUniqueKey(Author.AUTHOR, "PK_T_AUTHOR", Author.AUTHOR.ID);
        public static final UniqueKey<BookRecord> PK_T_BOOK = Internal.createUniqueKey(Book.BOOK, "PK_T_BOOK", Book.BOOK.ID);
        public static final UniqueKey<BookStoreRecord> UK_T_BOOK_STORE_NAME = Internal.createUniqueKey(BookStore.BOOK_STORE, "UK_T_BOOK_STORE_NAME", BookStore.BOOK_STORE.NAME);
        public static final UniqueKey<BookToBookStoreRecord> PK_B2BS = Internal.createUniqueKey(BookToBookStore.BOOK_TO_BOOK_STORE, "PK_B2BS", BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_AUTHOR_ID = Internal.createForeignKey(org.jooq.example.db.h2.Keys.PK_T_AUTHOR, Book.BOOK, "FK_T_BOOK_AUTHOR_ID", Book.BOOK.AUTHOR_ID);
        public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_CO_AUTHOR_ID = Internal.createForeignKey(org.jooq.example.db.h2.Keys.PK_T_AUTHOR, Book.BOOK, "FK_T_BOOK_CO_AUTHOR_ID", Book.BOOK.CO_AUTHOR_ID);
        public static final ForeignKey<BookToBookStoreRecord, BookStoreRecord> FK_B2BS_BS_NAME = Internal.createForeignKey(org.jooq.example.db.h2.Keys.UK_T_BOOK_STORE_NAME, BookToBookStore.BOOK_TO_BOOK_STORE, "FK_B2BS_BS_NAME", BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
        public static final ForeignKey<BookToBookStoreRecord, BookRecord> FK_B2BS_B_ID = Internal.createForeignKey(org.jooq.example.db.h2.Keys.PK_T_BOOK, BookToBookStore.BOOK_TO_BOOK_STORE, "FK_B2BS_B_ID", BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);
    }
}