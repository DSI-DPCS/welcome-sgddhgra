package edu.dsi.PP;

import java.util.Scanner;

public class Maze {
    int width,height;
    int[][] maze;
    Robot r;
    public Maze(int[][] maze){
        this.width = maze[0].length;
        this.height = maze.length;
        this.maze = maze;
        r = new Robot();
    }

    public void output(){
        System.out.println(checkPosition());

        for (int h = 0; h < height; h++){
            for(int w = 0; w < width; w++) {
                    if (maze[h][w] > 0){
                        System.out.print(" @ ");
                    }
                    else {
                        if(r.getX() == w && r.getY() == h) {
                            System.out.print(" * ");
                        }else {
                            System.out.print(" _ ");
                        }
                    }

            }
            System.out.println("");
        }

    }

    /**
     * Set the rules here, if the rule be violated, the relevant message will be returned.
     * @return
     */
    private String checkPosition(){
        // TODO: out of boundary, Robot goes back

        // TODO: hit the rock, Robot goes back

        // TODO: get through from the Maze

        return "";
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        whileloop : {
            while (scanner.hasNext()) {
                char c = scanner.next().charAt(0);
                switch (c) {
                    case 'd':
                        r.right();
                        output();
                        break;
                    case 'w':
                        r.upward();
                        output();
                        break;
                    case 's':
                        r.downward();
                        output();
                        break;
                    case 'a':
                        r.left();
                        output();
                        break;
                    case 'q':
                        break whileloop;
                    default:
                        output();
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] b = {
                {0,0,1,0,0},
                {0,0,0,1,0},
                {0,1,0,0,0},
                {0,0,0,1,1},
                {0,1,0,0,0}};
        Maze m = new Maze(b);
        Robot r = m.new Robot();
        m.output();
        m.run();

    }

    class Robot {
        private int x = 0, y = 0;
        private int previousX = 0, previousY = 0;

        public int getX(){return this.x;}
        public int getY(){return this.y;}

        public void right(){
            //TODO: Please finish the code for this method
        }

        public void downward(){
            //TODO: Please finish the code for this method
        }
        public void upward(){
            //TODO: Please finish the code for this method
        }

        public void left(){
            //TODO: Please finish the code for this method
        }

        public void rollback(){
            //TODO: Please finish the code for this method
        }
    }

}
