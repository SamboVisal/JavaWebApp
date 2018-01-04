
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sambo visal
 */
public class AuditFilter implements Filter{
     static int count=0;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("start filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        count++;
        request.setAttribute("count",count);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    
    }
    
}
