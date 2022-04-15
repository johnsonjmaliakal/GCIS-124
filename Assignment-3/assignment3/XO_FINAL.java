//import block
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class XO_FINAL extends Application {
    public char turn = 'X';
    public Cell[][] cell = new Cell[3][3];
    public Label status = new Label("X Player Turn");       //status text at top of scene
    Button reset = new Button("Reset");     //reset button at bottom of screen

    public boolean Full(){      //this function checks whether the game is a draw
        for (int i = 0; i <3; i++){
            for (int j = 0; j < 3; j++){
                if (cell[i][j].getToken()==' '){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean Won(char token){     //this function checks whether current player has won
        for(int i=0; i<3; i++)
            if (cell[i][0].getToken()==token && cell[i][1].getToken()==token && cell[i][2].getToken()==token){
                    return true;
                }
                for(int j=0; j<3; j++)
            if (cell[0][j].getToken()==token && cell[1][j].getToken()==token && cell[2][j].getToken()==token){
                    return true;
                }
            if (cell[0][0].getToken()==token && cell[1][1].getToken()==token && cell[2][2].getToken()==token){
                    return true;
                }
            if (cell[0][2].getToken()==token && cell[1][1].getToken()==token && cell[2][0].getToken()==token){
                    return true;
                }
            return false;
        }
    

    public class Cell extends Pane{

        private char token = ' ';
        
        public Cell(){
            setStyle("-fx-border-color: black");
            this.setPrefSize(100,100);
            this.setOnMouseClicked(e-> handleMouseClick());
        }
        
        public char getToken(){
            return token;
        }
        
        public void setToken(char c){
            token=c;

            if(token=='X'){     //for drawing the 'X'
                Line line1 = new Line(20, 20, this.getWidth() - 20, this.getHeight() - 20);
                line1.endXProperty().bind(this.widthProperty().subtract(20));
                line1.endYProperty().bind(this.heightProperty().subtract(20));

                Line line2 = new Line(20, this.getHeight() - 20, this.getWidth() - 20, 20);
                line2.startYProperty().bind(this.heightProperty().subtract(20));
                line2.endXProperty().bind(this.widthProperty().subtract(20));

                this.getChildren().addAll(line1,line2);
            }
            else if(token=='O'){     //for drawing the 'O'
                Ellipse ellipse = new Ellipse(this.getWidth() / 2, this.getHeight() / 2, this.getWidth() / 2 - 14, this.getHeight() / 2 - 14);
                ellipse.centerXProperty().bind(this.widthProperty().divide(2));
                ellipse.centerYProperty().bind(this.heightProperty().divide(2));

                ellipse.radiusXProperty().bind(this.widthProperty().divide(2).subtract(14));        
                ellipse.radiusYProperty().bind(this.heightProperty().divide(2).subtract(14));  

                ellipse.setStroke(Color.BLACK);
                ellipse.setFill(Color.WHITE);

                getChildren().add(ellipse);
            }
        }
        
        private void handleMouseClick(){        //this function handles clicking of each box
            if(token == ' ' && turn != ' '){
                setToken(turn);

                if(Won(turn)){
                    status.setText(turn+ " Player Wins");
                    status.setStyle("-fx-text-fill: blue;");
                    turn = ' ';
                }

                else if (Full()){
                    status.setText("No Winner");
                    turn = ' ';
                }

                else {
                    if (turn == 'X'){
                        turn = 'O';
                    }
                    else {
                        turn = 'X';
                    }
                    status.setText(turn+" Player Turn");
                }
            }
        }
        
    }
    

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane pane = new GridPane();     //playable area
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                pane.add(cell[i][j] = new Cell(), j, i);
            }
        }
        pane.setAlignment(Pos.CENTER);
        pane.setMaxWidth(300);
        pane.setMaxHeight(300);

        BorderPane borderPane = new BorderPane();       //main pane; contains everything
        borderPane.setTop(status);
        borderPane.setCenter(pane);
        borderPane.setBottom(reset);

        BorderPane.setAlignment(reset, Pos.CENTER);
        BorderPane.setAlignment(status, Pos.CENTER);

        BorderPane.setMargin(status, new Insets(60,60,60,60));
        BorderPane.setMargin(reset, new Insets(50,50,50,50));

        status.setFont(Font.font(15));        
        reset.setFont(Font.font(15));

        Scene scene = new Scene(borderPane,600,600);        //scene
        primaryStage.setTitle("XO Game");
        primaryStage.setScene(scene);
        primaryStage.show();

        reset.setOnAction(e ->{     //this code handles reset button click; resets scene

            turn = 'X';
            cell = new Cell[3][3];
            status = new Label("X Player Turn");

            GridPane pane1 = new GridPane();
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    pane1.add(cell[i][j] = new Cell(), j, i);
                }
            }
            pane1.setAlignment(Pos.CENTER);
            pane1.setMaxWidth(300);
            pane1.setMaxHeight(300);

            BorderPane borderPane1 = new BorderPane();
            borderPane1.setTop(status);
            borderPane1.setCenter(pane1);
            borderPane1.setBottom(reset);

            BorderPane.setAlignment(reset, Pos.CENTER);
            BorderPane.setAlignment(status, Pos.CENTER);

            BorderPane.setMargin(status, new Insets(60,60,60,60));
            BorderPane.setMargin(reset, new Insets(50,50,50,50));

            status.setFont(Font.font(15));        
            reset.setFont(Font.font(15));

            Scene scene1 = new Scene(borderPane1,600,600);
            primaryStage.setTitle("XO Game");
            primaryStage.setScene(scene1);
            primaryStage.show();
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}