public class BmiService {
    public int calculate(int massa, int height) {
        int heightBd = height * height / 10000;
        return massa / heightBd;
    }
}

