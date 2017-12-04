package com.company;

    public class Printer {

        private int tonerLevel;
        private int pagesPrinted;
        private boolean duplex;

        private int fillUp(int filler) {

            if (tonerLevel > 0 && tonerLevel <=100) {
                if(this.tonerLevel + filler > 100) {
                    return -1;
                }
               tonerLevel += filler;
                return  this.tonerLevel;
            } else {
                return -1;
            }

        }

        public int printingPages (int pages) {
            int pagesToPrint = pages;
            if(this.duplex){
                pagesToPrint /=2;
                System.out.println("Printing in duplex mode");
            }
            this.pagesPrinted +=pagesToPrint;
            return pagesToPrint;

        }

        public int getPagesPrinted() {
            return pagesPrinted;
        }

        public Printer (int tonerLevel, boolean duplex) {
           if(tonerLevel >-1 && tonerLevel <=100) {
               this.tonerLevel = tonerLevel;
           } else {
               this.tonerLevel = -1;
           }
            this.tonerLevel = tonerLevel;
            this.pagesPrinted = 0;
            this.duplex = duplex;
        }
    }


