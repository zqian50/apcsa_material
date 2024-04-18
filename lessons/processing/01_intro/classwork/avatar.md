```
int x, y, animation;

void setup(){
  size(800, 600);
  x = width/2;
  y = height/2;
  animation = 2;
}

void draw(){
  background(255, 192, 203);
  avatar();
  if (animation == 1) {
    // reset
  }
  else if (animation == 2) {
    // bounce
  }
  else if (animation == 3) {
    // random position
  }
  else if (animation == 4) {
    // mouse position
    // Read: https://processing.org/reference/mouseX.html
  }
  else {
    x++;
    y++;
  }

}

```
