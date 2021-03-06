package homo.efficio.spring.web.api.test.stubber.model;

import com.sun.tools.javac.code.Symbol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author homo.efficio@gmail.com
 *         created on 2016-11-23.
 */
public class RequestMappingMethodModel {

    private final RequestMapping requestMappingAnnotation;

    private final String[] paths;

    private final RequestMethod[] reqMethods;

    private final String methodName;

    RequestMappingMethodModel(Symbol.MethodSymbol methodSymbol) {
        this.requestMappingAnnotation = methodSymbol.getAnnotation(RequestMapping.class);
        this.paths = requestMappingAnnotation.value();
        this.reqMethods = requestMappingAnnotation.method();
        this.methodName = methodSymbol.getSimpleName().toString();
    }

    public String[] getPaths() {
        return paths;
    }

    public RequestMethod[] getReqMethods() {
        return reqMethods;
    }

    public String getMethodName() {
        return methodName;
    }
}
