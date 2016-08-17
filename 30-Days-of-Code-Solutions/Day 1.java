        /* Declare second integer, double, and String variables. */
        int t;
        double r;
        String stringy1;
        String stringy2;

        /* Read and save an integer, double, and String to your variables.*/
       t = scan.nextInt();
       r = scan.nextDouble();
       stringy1 = scan.nextLine();
       stringy2 = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+t);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+r);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + stringy1 + stringy2);
