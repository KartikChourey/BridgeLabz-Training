package medwarehouse;

public class MedWarehouse {

    static void mergeSort(Medicine[] meds, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(meds, left, mid);
            mergeSort(meds, mid + 1, right);

            merge(meds, left, mid, right);
        }
    }

    static void merge(Medicine[] meds, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] L = new Medicine[n1];
        Medicine[] R = new Medicine[n2];

        for (int i = 0; i < n1; i++)
            L[i] = meds[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = meds[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].expiryDays <= R[j].expiryDays) {
                meds[k++] = L[i++];
            } else {
                meds[k++] = R[j++];
            }
        }

        while (i < n1)
            meds[k++] = L[i++];

        while (j < n2)
            meds[k++] = R[j++];
    }

    static void display(Medicine[] meds) {
        for (Medicine m : meds) {
            System.out.println(m.name + " - Expiry in " + m.expiryDays + " days");
        }
    }

    public static void main(String[] args) {
        Medicine[] meds = {
            new Medicine("Paracetamol", 180),
            new Medicine("Insulin", 30),
            new Medicine("Vitamin C", 365),
            new Medicine("Antibiotic", 90)
        };

        mergeSort(meds, 0, meds.length - 1);
        display(meds);
    }
}
