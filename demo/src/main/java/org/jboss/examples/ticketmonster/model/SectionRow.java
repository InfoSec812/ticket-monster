package org.jboss.examples.ticketmonster.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "section_rows")
public class SectionRow {

  @Id
  String row;

  @ManyToOne
  SectionAllocation section;

  @Column(name = "value")
  List<Long> value;
}
