package com.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class ButtonController {
    @FXML
    private TextField txtView;
    String result = "";
    boolean isStart = true;
    String operator = "";
    long number1 = 0;
    long number2 = 0; 
    String result1 = "", result2 = "";
    
    
    @FXML
    public void printNumber(ActionEvent event) {
        if(isStart) {
            result1 +=  ((Button)event.getSource()).getText();
            number1 = Long.parseLong(result1);
            txtView.setText(result1);
        }
        else{
            result2 +=  ((Button)event.getSource()).getText();
            number2 = Long.parseLong(result2);
            txtView.setText(result1 + " " + operator + " " + result2);
        }
    }
    
    @FXML
    public void processOperation(ActionEvent event){
        if (isStart) {
            operator = ((Button)event.getSource()).getText();
            isStart = false;
            txtView.setText(result1 + " " + operator);
        }
        else{
            if(!operator.equals("/")) {
                result = Long.toString(Operations.calculWithLong(number1, number2, operator));
                result1 = result;
                number1 = Long.parseLong(result1);
                result2 = "";
                number2 = 0;
                operator = ((Button)event.getSource()).getText();
                txtView.setText(result + " " + operator);        
            }
            else {
                double tmp = 0.0;
                result = Double.toString(Operations.calculWithDouble(number1, number2, operator));
                tmp = Double.parseDouble(result);
                if (tmp % 1 == 0) {
                    result1 = result;
                    number1 = (long) tmp;
                    result2 = "";
                    number2 = 0;
                    operator = ((Button)event.getSource()).getText();
                    txtView.setText(result + " " + operator);    
                    
                }
                else {
                    txtView.setText(result + " - End Operation");   //we don't have to go that deep :)
                    resetVariables();
                }       
            }
        }
    }
    
    @FXML
    public void printResult(){
        
        if (!operator.equals("/")) {
            result = Long.toString(Operations.calculWithLong(number1, number2, operator));
        }
        else {
            result = Double.toString(Operations.calculWithDouble(number1, number2, operator));
        }
        txtView.setText(result);
        resetVariables();
    }
    
    @FXML
    public void resetValues() {
        result = "";
        txtView.setText(result);
        resetVariables();
    }
    
    private void resetVariables() {
        isStart = true;
        number1 = 0;
        number2 = 0; 
        result1 = "";
        result2 = "";
        operator = "";
    }
}
