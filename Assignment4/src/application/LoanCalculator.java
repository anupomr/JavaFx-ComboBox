package application;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalculator extends Application
{
	TextField txtAnnualInterestRate=new TextField();
	TextField txtLoanAmount=new TextField();
	TextField txtNumberOfYears=new TextField();
	TextField txtMonthlyPayment=new TextField();
	TextField txtTotalPayment=new TextField();
	Button calcutate=new Button("Calcutate");
	Button clear = new Button("    Clear    ");
	
	String title="  Loan"+"\nCalculator";
	Label lblTitle=new Label(title);
	 //.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	@Override
	public void start(Stage primaryStage) throws Exception 
	{

		try {
			GridPane gridPane= new GridPane();
			gridPane.setAlignment(Pos.CENTER);
			gridPane.setVgap(6);
			gridPane.setHgap(6);
			gridPane.add(lblTitle, 1, 0);
			
			gridPane.add(new Label("Annual Interest Rate"), 0, 1);
			gridPane.add(txtAnnualInterestRate, 2, 1);
			
			gridPane.add(new Label("Number Of Years"), 0, 2);
			gridPane.add(txtNumberOfYears, 2, 2);
			
			gridPane.add(new Label("Loan Amount"), 0, 4);
			gridPane.add(txtLoanAmount, 2, 4);
			
			gridPane.add(new Label("Monthly Payment"), 0, 6);
			gridPane.add(txtMonthlyPayment, 2, 6);
			
			gridPane.add(new Label("Total payment"), 0, 8);
			gridPane.add(txtTotalPayment, 2, 8);
			
			gridPane.add(calcutate, 2, 10);
			gridPane.add(clear, 2, 12);
			
			Scene scene = new Scene(gridPane,400,400);
			
			primaryStage.setTitle("Loan Calculator");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) 
	{
		launch(args);
		
	}
	
	
}
