package me.whiteship.ioccontainerenvironmentprofile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("! prod & test")
public class TestBookRepository implements  BookRepository{
}
