package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice:  В библиотеку пытаются возвращают книгу");


        long start = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: В библиотеку успешно вернули книгу");
        System.out.println("aroundReturnBookLoggingAdvice: метод returnBook отработал за " + (end-start) +
                " милисекунд.");

        return  targetMethodResult;
    }
}
