(ns pomodore-timer.core-test
  (:require [clojure.test :refer :all]
            [pomodore-timer.core :refer :all]))

(deftest timer-state-test
  (testing "Is Off on beginning"
    (is (not (timer-state)))))
