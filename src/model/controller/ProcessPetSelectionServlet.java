package model.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.animal.Animal;
import utility.AnimalFactory;
import utility.CharacteristicsFactory;
import utility.FoodFactory;

/**
 * Servlet implementation class ProcessPetSelectionServlet
 */
@WebServlet("/processPetSelection.html")
public class ProcessPetSelectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessPetSelectionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String selectedPet = request.getParameter("selectedPet");
		String selectedBreed = request.getParameter("selectedBreed");
		String selectedFood = request.getParameter("selectedFood");
		
		Animal animal = new AnimalFactory().getAnimal(selectedPet);
		animal.setCharacteristics(new CharacteristicsFactory().getCharacteristics(selectedBreed, animal));
		animal.setFood(new FoodFactory().getFood(selectedFood, animal));
		
		request.setAttribute("pet", animal);
		
		request.getRequestDispatcher("display.jsp").forward(request, response);
	}

}
