public class RainfallPredictor {

    public static double predictRainfall(double makoka) {
        if (makoka <= 113.50) {
            if (makoka <= 35.20) {
                if (makoka <= 6.40) {
                    if (makoka <= 2.05) {
                        if (makoka <= 0.65) {
                            return 4.00;
                        } else {
                            return 4.98;
                        }
                    } else {
                        if (makoka <= 2.25) {
                            return 15.09;
                        } else {
                            return 9.27;
                        }
                    }
                } else {
                    if (makoka <= 23.30) {
                        if (makoka <= 8.05) {
                            return 23.15;
                        } else {
                            return 16.55;
                        }
                    } else {
                        if (makoka <= 24.45) {
                            return 57.46;
                        } else {
                            return 28.29;
                        }
                    }
                }
            } else {
                if (makoka <= 76.40) {
                    if (makoka <= 42.70) {
                        if (makoka <= 37.20) {
                            return 96.09;
                        } else {
                            return 44.93;
                        }
                    } else {
                        if (makoka <= 64.95) {
                            return 69.34;
                        } else {
                            return 80.44;
                        }
                    }
                } else {
                    if (makoka <= 82.05) {
                        if (makoka <= 80.50) {
                            return 93.66;
                        } else {
                            return 147.37;
                        }
                    } else {
                        if (makoka <= 83.50) {
                            return 62.85;
                        } else {
                            return 94.93;
                        }
                    }
                }
            }
        } else {
            if (makoka <= 231.30) {
                if (makoka <= 160.70) {
                    if (makoka <= 155.55) {
                        if (makoka <= 142.40) {
                            return 151.95;
                        } else {
                            return 189.67;
                        }
                    } else {
                        return 98.33;
                    }
                } else {
                    if (makoka <= 165.25) {
                        return 242.21;
                    } else {
                        if (makoka <= 229.60) {
                            return 196.46;
                        } else {
                            return 160.68;
                        }
                    }
                }
            } else {
                if (makoka <= 514.50) {
                    if (makoka <= 342.75) {
                        if (makoka <= 306.10) {
                            return 269.46;
                        } else {
                            return 300.77;
                        }
                    } else {
                        if (makoka <= 418.45) {
                            return 336.02;
                        } else {
                            return 398.21;
                        }
                    }
                } else {
                    return 610.57;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example usage:
        double makokaValue = 50.0; // Replace with your actual Makoka value
        double predictedRainfall = predictRainfall(makokaValue);
        System.out.println("Predicted Rainfall: " + predictedRainfall);
    }
}
