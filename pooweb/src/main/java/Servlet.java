import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Figuras.Paralelogramo;
import Figuras.Rombo;
import Figuras.Trapecio;
import Figuras.Triangulo;

public class Servlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entro al servlet");
        String acc=req.getParameter("acc");
        System.out.println(acc);
        switch (acc) {
            // Evalua que tipo de calculo desea el usuario
            case "areaTrap":
            req.getRequestDispatcher("areaTrapecio.jsp").forward(req, resp);
            break;
            case "perimTrap":
            req.getRequestDispatcher("perimetroTrapecio.jsp").forward(req, resp);
            break;
            case "areaTri":
            req.getRequestDispatcher("areaTriangulo.jsp").forward(req, resp);
            break;
            case "perimTri":
            req.getRequestDispatcher("perimetroTriangulo.jsp").forward(req, resp);
            break;
            case "areaPa":
            req.getRequestDispatcher("areaParalelogramo.jsp").forward(req, resp);
            break;
            case "perimPa":
            req.getRequestDispatcher("perimParalelogramo.jsp").forward(req, resp);
            break;
            case "areaRom":
            req.getRequestDispatcher("areaRombo.jsp").forward(req, resp);
            break;
            case "perimRom":
            req.getRequestDispatcher("perimetroRombo.jsp").forward(req, resp);
            break;
            // Evalua que figura selecciono el usuario
            case "Trapecio":
            req.getRequestDispatcher("menuTrapecio.jsp").forward(req, resp);
            break;
            case "Triangulo":
            req.getRequestDispatcher("menuTriangulo.jsp").forward(req, resp);
            break;
            case "Paralelogramo":
            req.getRequestDispatcher("menuParalelogramo.jsp").forward(req, resp);
            break;
            case "Rombo":
            req.getRequestDispatcher("menuRombo.jsp").forward(req, resp);
            break;
            default:
            System.out.println("No ingreso a ninguno");
            break;
        }
        System.out.println(acc);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String control=req.getParameter("control");
        System.out.println(control);
        switch (control) {
            case "areaTra":
            double base1=Double.parseDouble(req.getParameter("base1"));
            double base2=Double.parseDouble(req.getParameter("base2"));
            double altura1=Double.parseDouble(req.getParameter("altura1"));
            Trapecio tra=new Trapecio();
            req.setAttribute("area", tra.calcularArea(base1, base2, altura1));
            req.getRequestDispatcher("resultadoArea.jsp").forward(req, resp);
            break;
            case "perimTra":
            double lado1=Double.parseDouble(req.getParameter("lado1"));
            double lado2=Double.parseDouble(req.getParameter("lado2"));
            double lado3=Double.parseDouble(req.getParameter("lado3"));
            double lado4=Double.parseDouble(req.getParameter("lado4"));
            Trapecio tra1=new Trapecio();
            req.setAttribute("perimetro", tra1.calcularPerimetro(lado1, lado2, lado3, lado4));
            req.getRequestDispatcher("resultadoPerimetro.jsp").forward(req, resp);
            break;
            case "areaTria":
            double base3=Double.parseDouble(req.getParameter("base3"));
            double altura2=Double.parseDouble(req.getParameter("altura2"));
            Triangulo tri=new Triangulo();
            req.setAttribute("area", tri.calcularArea(base3, altura2));
            req.getRequestDispatcher("resultadoArea.jsp").forward(req, resp);
            break;
            case "perimetroTria":
            double lado5=Double.parseDouble(req.getParameter("lado5"));
            double lado6=Double.parseDouble(req.getParameter("lado6"));
            double lado7=Double.parseDouble(req.getParameter("lado7"));
            Triangulo tri1=new Triangulo();
            req.setAttribute("perimetro", tri1.calcularPerimetro(lado5, lado6, lado7));
            req.getRequestDispatcher("resultadoPerimetro.jsp").forward(req, resp);
            break;
            case "areaPa":
            double base=Double.parseDouble(req.getParameter("base"));
            double altura=Double.parseDouble(req.getParameter("altura"));
            Paralelogramo pa=new Paralelogramo();
            req.setAttribute("area", pa.calcularArea(base, altura));
            req.getRequestDispatcher("resultadoArea.jsp").forward(req, resp);
            break;
            case "perimPa":
            double lado8=Double.parseDouble(req.getParameter("lado8"));
            double lado9=Double.parseDouble(req.getParameter("lado9"));
            double lado10=Double.parseDouble(req.getParameter("lado10"));
            double lado11=Double.parseDouble(req.getParameter("lado11"));
            Paralelogramo pa1=new Paralelogramo();
            req.setAttribute("perimetro", pa1.calcularPerimetro(lado8, lado9, lado10, lado11));
            req.getRequestDispatcher("resultadoPerimetro.jsp").forward(req, resp);
            break;
            case "areaRom":
            double diaMayor=Double.parseDouble(req.getParameter("diaMayor"));
            double diaMenor=Double.parseDouble(req.getParameter("diaMenor"));
            Rombo rom=new Rombo();
            req.setAttribute("area", rom.calcularArea(diaMayor, diaMenor));
            req.getRequestDispatcher("resultadoArea.jsp").forward(req, resp);
            break;
            case "perimetroRom":
            double lado12=Double.parseDouble(req.getParameter("lado12"));
            Rombo rom1=new Rombo();
            req.setAttribute("perimetro", rom1.calcularPerimetro(lado12));
            req.getRequestDispatcher("resultadoPerimetro.jsp").forward(req, resp);
            break;
            default:
            System.out.println("No ingreso a ningun caso");
            break;
        }
    } 
    
}