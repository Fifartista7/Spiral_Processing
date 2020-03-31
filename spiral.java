/* Josue Arana - Artistic Pattern: Spiral*/
float t;

void setup()
{
 fullScreen(P2D); 
 background(20);
}

void draw(){
  //Create background that switches between black and white based on framecount.
  background(sin(frameCount*0.01)*127+127);
  
  //Characteristics of the line to draw
  stroke(255);
  strokeWeight(2);
  
  //Creates an x,y 2D matrix that allows you to replace a separate object, 
  pushMatrix();
    //let's place it in the middle of the screen.
    translate(width/2, height/2);
    
    /*When the draw function is called this will generate 80 lines of the same
     characteristics in a loop. The rotate function is used to indicate that we want 
     the object to spin. Then a shape is crated based on math functions*/
    for (int i =0; i < 80; i++){
      rotate(radians(frameCount*0.025)); 
      beginShape(LINES);
        stroke(255);      //begin gradient color with white
        vertex(x1(t+i),y1(t+i));
        stroke(255,0,0);  //end gradient color with red.
        vertex(x2(t+i),y2(t+i));
      endShape();
    }
    t+= 1;   //increase variable to change based on math functions
  popMatrix();
}

//MATH FUNCTIONS: using sine and cosine
float x1 (float t){
  return sin(t/20)*100;
}

float y1 (float t){
  return cos(t/20)*400 ;
}

float x2 (float t){
  return sin(t/20)*100;
}

float y2 (float t){
  return cos(t/20)*200 ;
}