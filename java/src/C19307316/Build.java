package C19307316;

public class Build
{
    startUI ui;

    //Screen
    float height;
    float width;
    float length;

    float degrees;
    float angleX;
    float angleY;
    
    float colour=0;


    public Build(startUI ui)
    {
        this.ui = ui;
        this.width = ui.width;
        this.height = ui.height;
        length=0;

    }

    public void render()
    {
        ui.background(0);
        ui.camera(ui.width, height, height/startUI.tan(startUI.PI/3), width, height, 0, 0, 1, 0); 
        ui.translate(width,height,length);
        ui.noFill();

        for(int i = 0 ; i < ui.getSmoothedBands().length ; i ++)
        {
            if(colour>3)
            {
                colour=0;
            }
            degrees += 0.00001*ui.getSmoothedBands()[i];
            angleX = startUI.tan(startUI.radians(degrees));
            ui.rotate(angleX);
            ui.stroke(startUI.map(i, 0, ui.getBands().length*colour, 255, 0), 255, 255);
            ui.box(-ui.getSmoothedBands()[i] * 0.2f,-ui.getSmoothedBands()[i] * 0.2f,-ui.getSmoothedBands()[i]*0.2f); 
            colour += ui.getBands().length*0.001f; 
        }
    }

}