package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {


    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFroUniLibrary(){}



    @Pointcut("execution(void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){}

    @Pointcut("allMethodsFroUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void



//
//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1" );
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2" );
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice(): writing Lod #3");
//    }





//    @Before("execution(public  void  aop.UniLibrary.getBook() )")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: попытка получить книгу ");



//        @Before("execution(public  void  *(..))")
//        public void beforeGetBookAdvice(){
//            System.out.println("beforeGetBookAdvice: попытка получить книгу ");
//        }
//
//    @Before("execution( *  returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу ");
//    }
}
