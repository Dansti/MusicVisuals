package C19307316;

public class Sun
{
    startUI ui;

    //Circle Values
    float r;
    float wh = 60;
    float arclength = 0;
    float theta;
    float c;

    //Lerp Values
    float lerpedAverage = 0;
    float average = 0;
    float sum = 0;

    //Screen
    float height;
    float width;
    float dividedHeight;

    public Sun(startUI ui)
    {
        this.ui = ui;
        this.height = ui.height;
        this.width = ui.width;
    }  

    public void render()
    {
        ui.camera(width/2, height/2, (height/2) / startUI.tan(startUI.PI*30 / 180), width/2, height/2, 0, 0, 1, 0);
        r = height/5;
        dividedHeight = height/16;
        ui.translate(width/2,height/2);
        ui.ellipse(0,0,r,r);
        ui.background(0);

        for (int i = 0; i < ui.getAudioBuffer().size(); i ++)
        {
            sum += startUI.abs( ui.getAudioBuffer().get(i));
        }
        average = sum /  ui.getAudioBuffer().size();
        lerpedAverage = startUI.lerp(lerpedAverage, average, 0.1f);
        for (int i = 0; i <  ui.getAudioBuffer().size(); i++)
        {
            arclength +=  dividedHeight - ui.lerpedBuffer[i] * wh/4;
            theta = arclength/r;
            
            
            ui.pushMatrix();
            ui.translate(r*startUI.cos(theta), r*startUI.sin(theta));
            ui.rotate(theta);
            c = startUI.map(i, 0,  ui.getAudioBuffer().size(), 0, 255);
            ui.stroke(c, 255, 255);
            ui.lerpedBuffer[i] = startUI.lerp(ui.lerpedBuffer[i],  ui.getAudioBuffer().get(i), 0.1f);        
            ui.line(i, dividedHeight - ui.lerpedBuffer[i] * dividedHeight * 4, i, dividedHeight + ui.lerpedBuffer[i] *dividedHeight * 4);
            ui.popMatrix();


            arclength +=  dividedHeight - ui.lerpedBuffer[i] * wh/4;
            //Prevents the arclength from breaking at a later point 
            if(arclength>5.36862144E8)
            {
                arclength=0;
            }
        }  
    }
    
}