class Recursion {

    public static void main(String[ ] args) {
        int result = factorial(4);
        System.out.println(result);

        int[] quadrado = {1680, 640};
        result = maiorQuadrado(quadrado);
        System.out.println(result);

        int[] nums = {2, 4, 6, 6, 8};
        result = sum(nums);
        System.out.println(result);
    }

    public static int factorial(int num) {
        if (num == 1) {
            return num;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static int maiorQuadrado(int[] lados) {
        int result = 0;
        int maior = 0;
        int menor = 0;
        
        if(lados[0] > lados[1]) {
            maior = lados[0];
            menor = lados[1];
        } else {
            maior = lados[1];
            menor = lados[0];
        }

        result = maior % menor;

        if(result == 0) {
            return menor;
        } else {
            int[] novosLados = {menor, result};
            return maiorQuadrado(novosLados);
        }
    }

    public static int sum(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        } else {
            return nums[0] + sum(removeFirst(nums));
        }
    }

    private static int[] removeFirst(int[] nums) {
        int[] newNums = new int[nums.length-1];
        for(int i=1; i<=newNums.length; i++) {
            newNums[i-1] = nums[i];
        }

        return newNums;
    }
}
