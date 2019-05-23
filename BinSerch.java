private int binarySearch(int findMe) {
        int low = 0;
        int hi  = list_iAS.size() -1;  // inclusive
        while (low <= hi) {
            int pageToCheck = (low + hi) / 2;
            int comparison = findMe.compareTo(list_iAS.get(pageToCheck));
            if (comparison == 0) return pageToCheck;
            else if (comparison < 0) hi = pageToCheck -1;
            else low = pageToCheck +1; 
        }
        return -1;
    }
