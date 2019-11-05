package admin.com.example.administrator.dagger.other;

import javax.inject.Inject;

public class Score {

    private int number;

    @Inject
    public Score(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
