class CombSort
{
    int getNextGap(int gap)
    {
        // Mencari nilai gap
        gap = (gap*10)/13;
        if (gap < 1)
            return 1;
        return gap;
    }

    // Untuk memulai sorting
    void sort(int arr[])
    {
        int n = arr.length;

        // Inisialisasi gap
        int gap = n;

        // Inisialisasi swap sebagai true
        boolean swapped = true;

        // Terus berjalan selagi gap tidak = 1 dan masih terjadinya swap
        while (gap != 1 || swapped == true)
        {
            // Cari gap berikutnya
            gap = getNextGap(gap);

            // Inisialisasi swap sebagai false sehingga terlihat bila terjadi swap atau tidak
            swapped = false;

            // Bandingkan semua elemen dengan gap
            for (int i=0; i<n-gap; i++)
            {
                if (arr[i] > arr[i+gap])
                {
                    // Swap arr[i] dengan arr[i+gap]
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;

                    // Set swap sebagai true
                    swapped = true;
                }
            }
        }
    }

    //Driver aplikasi
    public static void main(String args[])
    {
        int arr[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
        System.out.println("array awal");
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

        CombSort ob = new CombSort();
        ob.sort(arr);
        System.out.println("array yang sudah di sorting");
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");

    }
}
