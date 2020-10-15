int x = 400; 
int y = 600; 

void setup() {
    size(800, 800);
    background(0, 0, 40); 
}

void draw() {
    noStroke();
    fill(0,0,40);
    rect(0,0,800,800);
    
    fill(#FFFFFF);
    ellipse(100,300,3,3);
    ellipse(75,720,3,3);
    ellipse(650,50,3,3);
    ellipse(350,600,3,3);
    ellipse(375,425,3,3);
    ellipse(200,40,3,3);
    ellipse(670,670,3,3);
    ellipse(300,600,3,3);
    
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    
    fill(#D3CDCD);
    ellipse(100,100,150,150);
    fill(#8E8C8C);
    ellipse(120,50,20,20);
    ellipse(140,100,50,50);
    ellipse(70,150,30,30);
    ellipse(90,70,10,10);
    
    
    
    y--;
    
}
