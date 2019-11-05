package admin.com.example.administrator.dagger.other;

import javax.inject.Inject;

public class Student {

    private Score score;


    @Inject
    public Student(Score score) {
        this.score = score;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
