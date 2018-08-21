import unittest
import warnings
import logging
from stix2validator import validate_file, print_results, ValidationOptions
from pathlib import Path


class ResourceFileTest(unittest.TestCase):

    def setUp(self):
        self.validation_options = ValidationOptions(strict=True)
        base_path_src = "../../stix2gson/src/test/"
        base_path_out = "../../stix2gson/out/test/"
        self.resource_custom_pathlist = Path(base_path_src + "resources/custom").glob('**/*.json')
        self.resource_interoperability_pathlist = Path(base_path_src + "resources/interoperability").glob('**/*.json')
        self.resource_reference_pathlist = Path(base_path_src + "resources/reference").glob('**/*.json')
        self.serialized_custom_pathlist = Path(base_path_out + "serialized/custom").glob('**/*.json')
        self.serialized_interoperability_pathlist = Path(base_path_out + "serialized/interoperability").glob('**/*.json')
        self.serialized_reference_pathlist = Path(base_path_out + "serialized/reference").glob('**/*.json')

    def validate_stix(self, pathlist):
        for path in pathlist:
            results = validate_file(str(path), self.validation_options)
            with self.subTest(str(path)):
                print_results([results])
                self.assertTrue(results.is_valid)

    def test_resource_custom_files(self):
        self.validate_stix(self.resource_custom_pathlist)

    def test_resource_interoperability_files(self):
        self.validate_stix(self.resource_interoperability_pathlist)

    def test_resource_reference_files(self):
        self.validate_stix(self.resource_reference_pathlist)

    def test_serialized_custom_files(self):
        self.validate_stix(self.serialized_custom_pathlist)

    def test_serialized_interoperability_files(self):
        self.validate_stix(self.serialized_interoperability_pathlist)

    def test_serialized_reference_files(self):
        self.validate_stix(self.serialized_reference_pathlist)
