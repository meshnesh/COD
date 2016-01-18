package soldier;

public class player {
private int handleName;
private int level;
private int score;
private int lives;
public int getHandleName() {
	return handleName;
}
public void setHandleName(int handleName) {
	this.handleName = handleName;
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level = level;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public int getLives() {
	return lives;
}
public void setLives(int lives) {
	this.lives = lives;
}
public player(int handleName) {
	super();
	this.handleName = handleName;
}
public player(int handleName, int level) {
	super();
	this.handleName = handleName;
	this.level = level;
}
public player(int handleName, int level, int score) {
	super();
	this.handleName = handleName;
	this.level = level;
	this.score = score;
}
public player(int handleName, int level, int score, int lives) {
	super();
	this.handleName = handleName;
	this.level = level;
	this.score = score;
	this.lives = lives;
}


}
