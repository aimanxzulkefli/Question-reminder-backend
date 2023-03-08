package com.portfolio.proiv.Repository;

import com.portfolio.proiv.Models.Questions;
import org.springframework.data.jpa.repository.JpaRepository;


@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Questions,Long> {


}
