package com.example.SpringbootLearning.rep;

import com.example.SpringbootLearning.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
