package C19307316;


public class testing
{

    /* Experimental idea */


    startUI ui;

    //Screen
    float height;
    float width;

    Wheels[] wheels;
    Train train;

    int wheel=5;
    int x;
    int y;
    int z;
    float angles;


    public testing(startUI ui)
    {
        this.ui = ui;
        this.width = ui.width;
        this.height = ui.height;

        x = 400;
        y = 0;
        z = 200;

        train = new Train(z,z,-1000);
        wheels = new Wheels[wheel];
        for(int i=0;i<wheel;i++)
        {
            wheels[i] = new Wheels(x-(z*i),y,z);
        }
    }

    public void render()
    {
        ui.camera(ui.mouseX,ui.mouseY,(height/2)/startUI.tan(startUI.PI*30/180),width/2,height/2,0,0,1,0); 
        ui.translate(width/2,height/2,0);
        //Train
        train.display();
        //Wheels
        ui.rotateY(startUI.PI/2);
        ui.stroke(255,255,255);
        ui.translate(0,0,100);
        for(int j=0;j<wheel;j++)
        {
            wheels[j].display();
        }
        ui.translate(0,0,-200);
        for(int j=0;j<wheel;j++)
        {
            wheels[j].display();
        }
        
    }

    public class Wheels
    {
        float x,y,radius;
        float angle;
        float zspeed = 0;
        float colour=0;

        public Wheels(float x, float y, float radius)
        {
            this.x = x;
            this.y = y;
            this.radius = radius;
            
        }
        public void display()
        {
            for(int i=0; i<ui.getSmoothedBands().length;i++)
            {
                if(colour>3)
                {
                    colour=0;
                }
                ui.pushMatrix();
                ui.translate(zspeed,0,0);
                ui.stroke(startUI.map(i, 0, ui.getBands().length*colour, 255,0), 255, 255);
                ui.ellipse(x,y,-ui.getSmoothedBands()[i]*0.2f,-ui.getSmoothedBands()[i]*0.1f);
                ui.popMatrix();
                colour += ui.getBands().length*0.001f;
            }

            if(zspeed <= width)
            {
                zspeed=zspeed+2.5f;
            }
            if(zspeed >= width)
            {
                zspeed=0;
            }

        }

    }

    public class Train
    {
        float xpos;
        float ypos;
        float zpos;
        float zspeed=0;

        public Train(float tempXpos,float tempYpos,float tempZpos)
        {
            xpos = tempXpos;
            ypos = tempYpos;
            zpos = tempZpos;
        }
        public void display()
        {
            ui.stroke(0);
            ui.noFill();
            ui.stroke(255,255,255);
            ui.pushMatrix();
            ui.translate(0,0,zspeed);
            ui.box(xpos,ypos,zpos);
            ui.popMatrix();


            ui.pushMatrix();
            ui.translate(0,-100,zpos/-2+zspeed-250);
            ui.box(xpos,ypos,zpos/2);
            ui.popMatrix();

            if(zspeed >= -width)
            {
                zspeed=zspeed-5;
            }
            if(zspeed <= -width)
            {
                zspeed=0;
            }
        }

    }




}


package ie.tudublin;


public class Pond
{

    startUI ui;

    //Screen
    float height;
    float width;

    Stainedglass[] stainedglass;

    float topleftX;
    float topleftY;

    float toprightX;
    float toprightY;

    float bottomleftX;
    float bottomleftY;

    float bottomrightX;
    float bottomrightY;



    float average;
    float sum;
    float lerpedAverage;



    public Pond(startUI ui)
    {
        this.ui = ui;
        this.width = ui.width;
        this.height = ui.height;

        topleftX=0;
        topleftY=0;
    
        toprightX=width;
        toprightY=0;
    
        bottomleftX=0;
        bottomleftY=height;
    
        bottomrightX=width;
        bottomrightY=height;


        stainedglass = new Stainedglass[ui.getSmoothedBands().length];
        for(int i=0;i<ui.getSmoothedBands().length;i++)
        {
            stainedglass[i] = new Stainedglass(topleftX+(i*10),topleftY+(i*10),(width/2)-(i*10), bottomleftY+(i*10),toprightX-(i*10), toprightY+(i*10));
        }
    }

    public void render()
    {
        for(int i=0;i<ui.getSmoothedBands().length;i++)
        {
            stainedglass[i].display();
            stainedglass[i].move(i);
        }

    }


    public class Stainedglass
    {
        float x1,x2,x3;
        float y1,y2,y3;

        public Stainedglass(float x1, float y1,float x2,float y2,float x3,float y3)
        {
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            this.y1 = y1;
            this.y2 = y2;
            this.y3 = y3;
        }

        public void display()
        {
            ui.noFill();
            ui.stroke(255,255,255);
            ui.triangle(x1, y1, x2, y2, x3, y3);
        }

        public void move(int i)
        {
        }


    }






    package ie.tudublin;

public class Pond
{

    startUI ui;

    //Screen
    float height;
    float width;

    Falling falling;

    public Pond(startUI ui)
    {
        this.ui = ui;
        this.width = ui.width;
        this.height = ui.height;

        falling = new Falling(width, height);

    }

    public void render()
    {
        ui.noFill();
        ui.stroke(0,255,255);
        
        falling.move();
        falling.display(); 


    }


    public class Falling
    {
        float x,y,z;

        float centrerightX = (width-width/4);
        float centreleftX = (width/2-width/4);
        float centreX;
        float centreY;
        float centreupY = (height/2-width/4);
        float centredownY =(height/2+width/4);
        float radius;
        float color = 50;

        public Falling(float x, float y)
        {
            this.centreX = x/2;
            this.centreY = y/2;
            this.radius = x/2;
        }

        public void display()
        {
            if(color>=250)
            {
                color=0;
            }
            ui.ellipse(width/2,height/2,radius,radius);
            ui.stroke(color,255,255);
            color+=50;
            ui.triangle(centrerightX,centreY,centreX,centreY,centreX,centreupY);
            ui.stroke(color,255,255);
            color+=50;
            ui.triangle(centreleftX,centreY,centreX,centreY,centreX,centreupY);
            ui.stroke(color,255,255);
            color+=50;
            ui.triangle(centreleftX,centreY,centreX,centreY,centreX,centredownY);
            ui.stroke(color,255,255);
            ui.triangle(centrerightX,centreY,centreX,centreY,centreX,centredownY);
        }
        public void move()
        {  
            for(int i=0;i<ui.getSmoothedBands().length;i++)
            {
                //centrerightX-=ui.getSmoothedBands()[i];
                //centreleftX+=ui.getSmoothedBands()[i];
                //centreupY+=ui.getSmoothedBands()[i];
                //centredownY-=ui.getSmoothedBands()[i];
                radius=ui.getSmoothedBands()[i]*20f;
                //System.out.print("\n" + ui.getSmoothedBands()[i] + "\n");
                if(centrerightX<width/2)
                {
                    centrerightX=(width-width/4);
                }
                if(centreleftX>width/2)
                {
                    centreleftX=(width/2-width/4);
                }
                if(centreupY>height/2)
                {
                    centreupY=(height/2-width/4);
                }
                if(centredownY<height/2)
                {
                    centredownY=(height/2+width/4);
                }
                if(radius>height)
                {
                    radius = width/2;
                }
            }
        }
    }



}



package ie.tudublin;


public class Pond
{
    //CleanUp
    startUI ui;

    //Screen
    float height;
    float width;

    Falling[] falling;
    int shapeamount = 10;

    public Pond(startUI ui)
    {
        this.ui = ui;
        this.width = ui.width;
        this.height = ui.height;

        falling = new Falling[shapeamount];

        for (int i=0;i<shapeamount;i++) 
        {
            falling[i] = new Falling(i);
        }

    }

    public void render()
    {

        
        for(int i=0;i<shapeamount;i++)
        {
            falling[i].move();
            falling[i].display(); 
        }

    }


    public class Falling
    {
        int sh;
        float x,y,z;

        public Falling(int i)
        {
            this.sh = i;
            x = 0;
            y = 0;
            z = 100;
        }
        public void display()
        {
            if(sh%2==0)
            {
                ui.ellipse(x,y,z,z);
            }
            else
            {
                ui.rect(x,y,z,z);
            }
            ui.translate(200,0,0);
        }
        public void move()
        {  
            for(int i=0;i<ui.getSmoothedBands().length;i++)
            {   
                y++;
                z=ui.getSmoothedBands()[i];
                if(y>height)
                {
                    y=0;
                }
            }
        }
    }



}
