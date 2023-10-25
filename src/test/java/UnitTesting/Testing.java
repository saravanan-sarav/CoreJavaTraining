package UnitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testing {
    MainClass mainClass = new MainClass();
    @BeforeAll
  static  void add_Before(){
        System.out.println("doing All");
    }
    @Test
    void addTest(){
        int result = mainClass.add();
        Assertions.assertEquals(result,9);
    }


    @BeforeEach
    void add_BeforeEach(){
        System.out.println("BeforeEach");
    }

}
