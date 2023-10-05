import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConverterMoedaServlet")
public class ConverterMoedaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtenha o valor em Real do formulário
        String valorEmRealStr = request.getParameter("valor");
        double valorEmReal = Double.parseDouble(valorEmRealStr);

        // Faça a conversão para quatro moedas (exemplo)
        double valorEmDolar = valorEmReal * 5.30; // Taxa de conversão para dólar
        double valorEmEuro = valorEmReal * 6.20;  // Taxa de conversão para euro
        double valorEmLibra = valorEmReal * 7.40; // Taxa de conversão para libra
        double valorEmBitcoin = valorEmReal * 0.000001; // Taxa de conversão para bitcoin

        // Armazene os resultados em atributos de requisição
        request.setAttribute("valorEmDolar", valorEmDolar);
        request.setAttribute("valorEmEuro", valorEmEuro);
        request.setAttribute("valorEmLibra", valorEmLibra);
        request.setAttribute("valorEmBitcoin", valorEmBitcoin);

        // Encaminhe para a página JSP de resultado
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}

