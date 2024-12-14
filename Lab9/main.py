from experiment_cat import ExperimentCat

#Start project

if __name__ == "__main__":
    shreding_cat = ExperimentCat("Shred", "british", "0987654321", "Shreding", True, "room")
    shreding_cat.status()
    shreding_cat.set_place()
    shreding_cat.put_poison()
    shreding_cat.check_experiment()
    shreding_cat.box()
    shreding_cat.out_poison()
    shreding_cat.check_experiment()
    shreding_cat.put_poison()
    shreding_cat.check_experiment()