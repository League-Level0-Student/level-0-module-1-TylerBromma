void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#FA0A0A);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#0C8619);
    rect(176, 103, 12, 32);
    if(mousePressed){
      
    fill(#FCFFFD);
    ellipse(75,200,50,50);
    }
}
