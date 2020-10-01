
void setup() {
    size(500,500);
    noStroke();
    fill(#F2AD62);
    ellipse(250,250,200,200);
    fill(#F0453C);
    ellipse(250,250,180,180);
    fill(#FEFF31);
    ellipse(250,250,170,170);
}
void draw() {
    PImage pepperoni;
    PImage olive;
    PImage mushroom;
    pepperoni = loadImage("pepperoni.png");
    olive = loadImage("olive.png");
    mushroom = loadImage("mushroom.png");
    pepperoni.resize(50,50);
    olive.resize(25,25);
    mushroom.resize(30,30);
    if(mousePressed && mouseButton == RIGHT){
    image(olive,275,275);
    image(olive,200,200);
    image(olive,250,220);
    image(mushroom,220,180);
    image(olive,225,250);
    image(mushroom,275,275);
    image(olive,250,180);
    image(mushroom,200,275);
    }
    if(mousePressed && mouseButton == LEFT){
    image(pepperoni,225,280);
    image(pepperoni,200,190);
    image(pepperoni,275,200);
    image(pepperoni,175,225);
    image(pepperoni,250,250);
    }
}
