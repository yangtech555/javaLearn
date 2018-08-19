package com.yhb.Iterator;

/**
 * Created by yanghongbo on 2018/8/19.
 */
public class IteratorMain {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("java入门"));
        bookShelf.appendBook(new Book("helloworld"));
        bookShelf.appendBook(new Book("呵呵呵"));
        bookShelf.appendBook(new Book("jaiojofid"));

        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            System.out.println(((Book)iterator.next()).getName());
        }
    }
}
